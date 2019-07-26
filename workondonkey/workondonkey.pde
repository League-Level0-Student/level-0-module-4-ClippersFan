PImage donkey;
PImage tail;
int x;
int y;  
void setup(){
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(300,221);
  
}
void draw(){
  x = mouseX;
  y = mouseY;
  background(donkey);
  tail.resize(50,50);
  rect(0,0,30,30);
  rect(255,65,50,50);
  if(dist(0,0,mouseX,mouseY) < 30){
    background(255,0,0);
    
  }
  if(dist(255,65,mouseX,mouseY) < 50){
    background(0,255,0);
  }
  if(mousePressed){
    image(tail,x,y);
  }
  import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
  
  
  
 
}
