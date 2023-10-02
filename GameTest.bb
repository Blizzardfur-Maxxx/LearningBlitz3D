Graphics3D 640,480,32,2
SetBuffer BackBuffer()

camera = CreateCamera()
CameraClsColor camera, 0,0,255

light = CreateLight()

sphere = CreateSphere()

cylinder = CreateCylinder(32)

cube = CreateCube()

cone = CreateCone(32)

PositionEntity cone, 0,-2,5
PositionEntity cube, 2,0,5
PositionEntity cylinder, -2,0,5
PositionEntity sphere, 0,0,5

ScaleEntity sphere, 0.5,0.5,.5

EntityColor sphere, 0,0,255 ; r,g,b
EntityColor cube, 0,255,0 ; r,g,b
EntityColor cylinder, 255,0,0 ; r,g,b
EntityColor Cone, 255,0,255 ; r,g,b

EntityAlpha cone,0.75
EntityAlpha cube,0.4
EntityAlpha cylinder,1



While Not KeyDown(1)

;sphere cumtroller
If KeyDown(203) Then TranslateEntity sphere, -0.1,0,0
If KeyDown(205) Then TranslateEntity sphere, 0.1,0,0
If KeyDown(205) Then TranslateEntity sphere, 0,-0.1,0
If KeyDown(200) Then TranslateEntity sphere, 0,0.1,0

RenderWorld
Flip

Wend


End