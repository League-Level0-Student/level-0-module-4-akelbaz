PImage backgorund;
PImage creeper;

float rand = random(1024);
int randoom = int(rand);
float rand2 = random(576);
int randoom2 = int(rand);
void setup(){
size(1024,576);
  backgorund=loadImage("Forest.jpg");
creeper=loadImage("creeper.png");
creeper.resize(20,20);
}
void draw(){
background(backgorund);
image(creeper, rand, rand2);
fill(355,0,0);
ellipse(mouseX,mouseY,10,10);
}
