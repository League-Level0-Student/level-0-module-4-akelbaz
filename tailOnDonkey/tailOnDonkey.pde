import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch


// put these lines where you want the sound to play


PImage donkey;
PImage tail;

boolean click=false;

int mousex = 0;
int mousey = 0;
void setup(){
size(800,566);
donkey = loadImage("donkey.jpg");
donkey.resize(800,566);
tail = loadImage("tail.png");
tail.resize(30,80);
Minim minim = new Minim(this);    //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
}
void draw(){
background(donkey);
if(mousePressed){
mousex = mouseX;
mousey = mouseY;
click=true;
}
if(dist(570, 270, mouseX, mouseY) > 40){
background(donkey);
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
rect(0, 0, 30, 30);
rect(570, 270, 40, 40);
if(click){image(tail, mousex, mousey);
}else if(!click){
image(tail,mouseX,mouseY);
}
}
if(dist(0, 0, mouseX, mouseY) > 30){
background(1000,10000,1000);
}
}
