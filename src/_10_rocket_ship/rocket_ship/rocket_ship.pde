int x = 400; 
int y = 600; 

void setup() {

    size(800, 800);

}

void draw() {
    background(0, 0, 40);
    y=y-1;
    fill(random(255), 0, 0);
    ellipse(x, y + 150,10000, 90);
    fill(248, 128, 0);
    ellipse(x, y + 200, 10000, 70);
    fill(255, 153, 0);
    ellipse(x, y + 200, 10000, 35);
    fill(1000,0, 400);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    
    
    
}
