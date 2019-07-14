PImage face; 
int x =  mouseX;
int y = mouseY;
void setup(){
  size(600,600);
  face = loadImage("face.jpg");
 face.resize(600,600);
   
  
   
}

void draw(){
  background(face);
  fill(255,255,255);
  ellipse(455,379,80,80);
  fill(255,255,255);
  ellipse(105,320,80,80);
if (mouseX>77&&mouseX<136&&mouseY>290&&mouseY<348) {
 
  x = mouseX;
  y = mouseY;
  
}
fill(0,0,0);
  ellipse(x,y,20,20);
  fill(0,0,0);
  ellipse(x + 350, y + 59, 20, 20);
}
