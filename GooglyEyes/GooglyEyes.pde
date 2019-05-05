PImage face;

void setup(){
size(500,500);
 face = loadImage("face.jpg");
face.resize(500,500);
}
void draw(){
background(face);
  fill(0,0,0);
  ellipse(350,340,25,25);
  ellipse(350,360,25,25);
  ellipse(350,380,25,25);
fill(255,255,255);
  ellipse(75,300,100,100);
  ellipse(300,300,100,100);
fill(0,0,0);
  ellipse(mouseX,mouseY,25,25);
  ellipse(mouseX+235,mouseY,25,25);
      if(mouseX<=24){
      mouseX=25;
       }
      if(mouseX>=126){
      mouseX=125;
      }
      if(mouseY<=249){
      mouseY=250;
      }
      if(mouseY>=351){
      mouseY=350;
      }
      println(mouseX+" "+mouseY);
}