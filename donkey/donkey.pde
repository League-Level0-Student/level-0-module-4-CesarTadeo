PImage donkey;
PImage tail;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;  





void setup(){
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
  
  size(1000,800);
 donkey = loadImage("donkey.jpg");
 tail = loadImage("tail.png");
  donkey.resize(width, height);
  
}

void draw(){
   if (dist(0,0,mouseX, mouseY) <30){
   background(donkey);    
   }
  else if (dist(763,201,mouseX, mouseY) <30){
  background(donkey);
  if (mousePressed){
  
  
  }
  }
  else {background(255,255,255);}
  image(tail, mouseX-10, mouseY-20);
  rect(0,0,30,30);
  rect(763,201,40,40);
    
}
