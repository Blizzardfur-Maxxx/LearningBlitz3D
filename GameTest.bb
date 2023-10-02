Graphics3D 800,600,32,2
SetBuffer BackBuffer()

;make camera
camera = CreateCamera()

;make entitys
light = CreateLight(32)
earth = CreateSphere(32)
sun = CreateSphere(32)
moon = CreateSphere(32)
mars = CreateSphere(32)
space = CreateSphere(32)

;load assets
player = LoadMesh("assets/obj_file.3ds")

texearth = LoadTexture("assets/earth.jpg")
texmoon = LoadTexture("assets/moon.jpg") 
texsun = LoadTexture("assets/sun.jpg")
texmars = LoadTexture("assets/mars.jpg")
texspace = LoadTexture("assets/space.jpg")

;load entitys
PositionEntity player, 8,0,5
PositionEntity moon, 7,0,6
PositionEntity sun, -20,0,5
PositionEntity earth, 5,0,5
PositionEntity mars, 10,0,4
PositionEntity space , 0,0,0

ScaleEntity player, 0.1,0.1,0.1
ScaleEntity moon, 0.5,0.5,0.5
ScaleEntity sun, 15,15,15
ScaleEntity mars , 0.85,0.85,0.85
ScaleEntity space , -1000,-1000,-1000

EntityTexture earth ,texearth 
EntityTexture moon ,texmoon
EntityTexture sun ,texsun
EntityTexture mars ,texmars
EntityTexture space ,texspace 

RotateEntity sun, -90,0,0
RotateEntity player, -90,0,0

;start game loop
While Not KeyDown(1)

;chase camera
PositionEntity camera,EntityX(player),EntityY(player),EntityZ(player)
MoveEntity camera,0,0,-3

;funny wasd camera rotate
If KeyHit(30) Then RotateEntity camera, -90,0,0
If KeyHit(32) Then RotateEntity camera, 90,0,0
If KeyHit(31) Then RotateEntity camera, 0,-90,0
If KeyHit(17) Then RotateEntity camera, 0,90,0

;sphere controller
If KeyDown(203) Then TranslateEntity player, -0.1,0,0
If KeyDown(205) Then TranslateEntity player, 0.1,0,0
If KeyDown(208) Then TranslateEntity player, 0,-0.1,0
If KeyDown(200) Then TranslateEntity player, 0,0.1,0
If KeyDown(203) Then RotateEntity player, -30,0,0
If KeyDown(205) Then RotateEntity player, 30,0,0
If KeyDown(208) Then RotateEntity player, 0,-30,0
If KeyDown(200) Then RotateEntity player, 0,30,0

RenderWorld
Flip

Wend


End