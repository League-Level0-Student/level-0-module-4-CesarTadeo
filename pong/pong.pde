int x = 500;
int y = 500;
int xSpeed = 20;
int ySpeed = 20;
int width = 900;
int length = 900;

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
rect(mouseX, 870, 150, 20); 
fill(#931313);  

if(intersects(x, y, mouseX, 870, 150)){
ySpeed = -ySpeed;
}  
}


boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
    if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
        return true;
    else
        return false;
} 

  
