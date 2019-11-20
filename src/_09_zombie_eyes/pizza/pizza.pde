
void setup() {
  
  size(500,500);
  
  
    PImage face = loadImage("cat.jpg");
    face.resize(500,500);
    
image(face, 0, 0);
}
void draw() {
    print(mouseX + " " + mouseY + "\n");
    fill(#F20C0C+mouseX+mouseY);
 ellipse(228,209,50,50);
 ellipse(301,182,50,50);
 
}
