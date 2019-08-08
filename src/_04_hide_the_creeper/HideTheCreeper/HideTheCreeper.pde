PImage creeper;
int x = 600;
int y = 150;
void setup(){
  size(700,350);
  PImage minecraft = loadImage("minecraft.png");
  minecraft.resize(700,350);
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(50,25);
}
void draw(){
  image(creeper,x,y);
  if(mousePressed){
    
  if(isNear(mouseX,x+25) && isNear(mouseY,y+13)){
    fill(0,255,0);
    
    
  }else{
    fill(255,0,0);
    
  }
  ellipse(mouseX,mouseY,20,20);
  }
  
}
boolean isNear(int a, int b) {
    if(abs(a-b) < 10)
      return true;
    else
        return false;
}
