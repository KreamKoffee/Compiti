import pgzrun, os
from random import randint
WIDTH = 350
HEIGHT = 600

bird = Actor("bird_1.png", (75, 100))
bar_up = Actor("bar_1.png",(300,0))
bar_down = Actor("bar_2.png",(300, 540))

birds = ["bird_1.png", "bird_2.png", "bird_3.png"]
wing_index = 0

game_over = False

g = 0.3
fall_speed = 0

up_speed = -6

speed = 2

score = 0

def wings():
    global wing_index
    bird.image = birds[wing_index]
    wing_index = (wing_index+1) %3


    
def on_key_down (key):
    global fall_speed
    if not game_over:
        print("键盘按下")
        fall_speed = up_speed
        sounds.ji.play()

def update_bar():
    global score
    bar_up.x -= speed
    bar_down.x = bar_up.x

    if bar_up.x < -20:
        sounds.score.play()
        bar_x = WIDTH +10

        bar_up.pos = (bar_x, randint(-150, 150))
        bar_down.pos = (bar_x, 580 + bar_up.y)
        sounds.deng.stop()
        score += 10
        

def update():
    global fall_speed, game_over
    if not game_over:
        wings()
        fall_speed += g
        bird.y += fall_speed
        update_bar()
        if bird.colliderect(bar_up) or bird.colliderect(bar_down) or bird.y < 0 or bird.y > HEIGHT :
            sounds.niganma.play()
            game_over = True
def draw():
    screen.blit("bg.png", (0, 0))
    bar_down.draw()
    bar_up.draw()
    bird.draw()
    screen.draw.text(str(score), topleft = (10, 10))

    if game_over:
        screen.fill("lightgreen")
        screen.blit("gameover.png", (20,250))




pgzrun.go()