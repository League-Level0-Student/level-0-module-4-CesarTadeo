PImage creeper;

 int X = (int)random(0,1200);
 int Y =(int)random(0,800);

void setup(){
  creeper=loadImage("creeper.png");
  
  size(1200,800);
  PImage minecraft = loadImage("minecraft2.jpg");
  minecraft.resize(1200, 800);
  background(minecraft);
  creeper.resize(30,30);
  
  
  
  
  
}
void draw(){
  image(creeper, X, Y);
  
  
  if (isNear(mouseX,X)&&(isNear(mouseY,Y))){
    fill(#3AFF15);
  ellipse(mouseX, mouseY, 30,30); 
  }
  
  
  
  
  
 
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
