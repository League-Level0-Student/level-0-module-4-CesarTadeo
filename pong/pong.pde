int x = 500;
int y = 500;
int xSpeed = 16;
int ySpeed = 16;


void setup(){
  size(900,900);
  
  
  
  
  
  
}


void draw(){
background(#435476);
ellipse(x, y, 30, 30);

fill(#A21919);
stroke(#A21919);
x+=xSpeed;
y+=ySpeed;

if(x > width || x < 0){
    xSpeed = -xSpeed;
}  
if(x > height || x < 0){
    ySpeed = -ySpeed;
}  
rect(500, 870, 130, 20); 
fill(#931313);  

Boolean(x, y, 500, 870, 110); {
    if (y > 870 && x > 500 && x < 500 + 110)
        xSpeed = -xSpeed;
        ySpeed = -ySpeed
    else
        ;
}
  
  
}
