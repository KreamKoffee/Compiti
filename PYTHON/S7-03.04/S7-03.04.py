import pgzrun as p
import os

os.environ['SDL_VIDEO_WINDOW_POS'] = '100,100'

WIDTH = 800
HEIGHT = 600

ball = Actor("ball.png",(400,300))
paddle = Actor('paddle.png', (450,550))

dx = 3
dy = 3

icecubes = []
for i in range(6):
    for j in range(6):
        icecube = Actor('icecube.png')
        icecube.x = 100 + j*120
        icecube.y = 50 + i*40
        icecubes.append(icecube)

def draw():
    screen.blit("bg.png", (0,0))
    ball.draw()
    paddle.draw()
    
    for icecube in icecubes:
        icecube.draw()

def update():
    global dx, dy
    ball.x += dx
    ball.y += dy
    
    if ball.x >= WIDTH or ball.x <=0:
        dx = -dx
    
    if ball.y <= 0 or ball.colliderect(paddle):
        dy = -dy
        
    for icecube in icecubes:
        if ball.colliderect(icecube):
            icecubes.remove(icecube)
            dy = -dy
            break

def on_mouse_move(pos):
    paddle.x = pos[0]

p.go()