PImage creeper;

 int X = (int)random(0,1200);
 int Y =(int)random(0,800);
PImage minecraft;
void setup(){
  creeper=loadImage("creeper.png");
  
  size(1200,800);
  minecraft = loadImage("minecraft2.jpg");
  minecraft.resize(1200, 800);
  background(minecraft);
  
  
  creeper.resize(30,30);
  
  
  
  
  
}
void draw(){
  background(minecraft);
  image(creeper, X, Y);
  
  
  image(creeper, X, Y);
  
  
  
  fill(#F20C0C);
  ellipse(mouseX, mouseY, 100,100);
  
  if (isNear(mouseX,X+15)&&(isNear(mouseY,Y+15))){
    fill(#3AFF15);
  ellipse(mouseX, mouseY, 150,150); 
  System.out.println("You found the creeper");
X = (int)random(width);
Y = (int)random(height);
}
  
  
  
  
  
 
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
