int y = 0;
int x = (int)random (500);
void setup(){
  size(500, 500);
 
}

void draw(){
  background(#FFFCFC);
  fill(#95D2FF);
  stroke(#298AD3);
  ellipse(x,y,10,10);
  y += 3;
  if(y > height){
    y = 0;
    x = (int)random (500);
  }
  rect(100, 400, 50, 50);
}
