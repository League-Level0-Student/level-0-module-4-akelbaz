PImage backgorund;
PImage creeper;

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}

import ddf.minim.*;          //at the very top of your sketch
AudioSample piano; 

float rand = random(730);
int randoom = int(rand);
float rand2 = random(580);
int randoom2 = int(rand);
void setup(){
size(750,600);
  backgorund=loadImage("forest.jpg");
  backgorund.resize(750,600);
creeper=loadImage("creeper.png");
creeper.resize(20,20);
Minim minim = new Minim(this);    //In the setup method
piano = minim.loadSample("piano.wav");     //
piano.trigger();
}
void draw(){
background(backgorund);
image(creeper, randoom, randoom2);
if(dist(randoom,randoom2,mouseX,mouseY)<20){
fill(#14FF00);
println("you found the creeper-click to continue");
if(mousePressed){
 rand = random(751);
 randoom = int(rand);
 rand2 = random(600);
 randoom2 = int(rand);
}
}else{
fill(355,0,0);
println(mouseX,mouseY);
}
ellipse(mouseX,mouseY,10,10);
}
