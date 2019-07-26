void setup() {
  PImage face = loadImage("face.png");
  size(800,600);
  face.resize(800,600);
  background(face);
  
}
void draw() {
  
  fill(255,255,255);
  ellipse(225,370,465,455);
  ellipse(600,350,455,465);
  fill(0,0,0);
 for(int i = 0; i < 3; i++){
  ellipse(mouseX+15,mouseY+15,200,200);
  ellipse(600,350,200,200);
 }
 if(mouseX==0){
   ellipse(225,370,455,465);
 }
 if(mouseX==800){
   ellipse(600,350,465,455);
 }
 if(mouseX < 0){
   mouseX = 0;
 }
 if(mouseX > 225){
   mouseX = 225;
 }
 if(mouseY < 145){
   mouseY = 145;
 }
 if(mouseY > 350){
   mouseY = 350;
 }
}
