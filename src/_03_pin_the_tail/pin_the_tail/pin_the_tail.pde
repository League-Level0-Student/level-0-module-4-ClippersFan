PImage donkey;
PImage tail;
boolean playing = true;
int tailX;
int tailY;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch



void setup() {
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav"); 
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(550,406);
  tail.resize(100,100);
}

void draw() {
  if(playing){
    if(dist(0,0,mouseX,mouseY) < 30 ){
    background(donkey);
  }else{
    background(0,255,0);
  }
  }else{
    background(donkey);
  }
  
    
  
  
  if(playing){
    image(tail,mouseX-10,mouseY-20);
  }else{
    image(tail,tailX,tailY);
  }
  if(mousePressed && playing){
    playing=false;
    tailX = mouseX;
    tailY = mouseY;
  }
  if(dist(454,75,tailX,tailY) < 30){
    if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
  
  
  
}
