import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Q3 extends Window {
  public Q3() {
    super("Quiz 3");
  }

  private void drawStar(GL2 gl, int x, int y, float size) {
    gl.glPointSize(size);
    gl.glBegin(GL2.GL_POINTS);
    gl.glVertex2i(x, y);
    gl.glEnd();
  }

  @Override
  public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
    gl.glLineWidth(4);

    // Background stars
    gl.glColor3f(1, 1, 1);
    for (int i = 0; i < 50; i++) {
      drawStar(gl, (int)(Math.random() * 640), (int)(Math.random() * 400),
              (float)(Math.random() * 3 + 1));
    }

    // Red roof with gradient
    gl.glBegin(GL2.GL_POLYGON);
    gl.glColor3f(0.8f, 0.2f, 0.2f);
    gl.glVertex2i(170, 270);
    gl.glColor3f(1f, 0.4f, 0.4f);
    gl.glVertex2i(240, 170);
    gl.glColor3f(0.8f, 0.2f, 0.2f);
    gl.glVertex2i(310, 270);
    gl.glEnd();

    // Green house front with gradient
    gl.glBegin(GL2.GL_POLYGON);
    gl.glColor3f(0.2f, 0.6f, 0.2f);
    gl.glVertex2i(170, 370);
    gl.glColor3f(0.3f, 0.8f, 0.3f);
    gl.glVertex2i(170, 270);
    gl.glVertex2i(310, 270);
    gl.glColor3f(0.2f, 0.6f, 0.2f);
    gl.glVertex2i(310, 370);
    gl.glEnd();

    // Blue extension with gradient
    gl.glBegin(GL2.GL_POLYGON);
    gl.glColor3f(0.2f, 0.2f, 0.8f);
    gl.glVertex2i(240, 170);
    gl.glColor3f(0.3f, 0.3f, 1f);
    gl.glVertex2i(440, 167);
    gl.glVertex2i(500, 260);
    gl.glColor3f(0.2f, 0.2f, 0.8f);
    gl.glVertex2i(310, 270);
    gl.glEnd();

    // Light purple wall with gradient
    gl.glBegin(GL2.GL_POLYGON);
    gl.glColor3f(0.5f, 0.5f, 0.9f);
    gl.glVertex2i(310, 270);
    gl.glColor3f(0.6f, 0.6f, 1f);
    gl.glVertex2i(500, 260);
    gl.glVertex2i(500, 360);
    gl.glColor3f(0.5f, 0.5f, 0.9f);
    gl.glVertex2i(310, 370);
    gl.glEnd();

    // Moon with glow effect
    for (int i = 40; i > 0; i -= 2) {
      gl.glPointSize(i);
      gl.glColor4f(1, 1, 0.8f, (40-i)/80f);
      gl.glBegin(GL2.GL_POINTS);
      gl.glVertex2i(310, 50);
      gl.glEnd();
    }
    gl.glPointSize(30);
    gl.glColor3f(1, 1, 0.9f);
    gl.glBegin(GL2.GL_POINTS);
    gl.glVertex2i(310, 50);
    gl.glEnd();

    // Window decorations
    gl.glColor3f(1f, 1f, 0.7f);
    gl.glBegin(GL2.GL_QUADS);
    gl.glVertex2i(200, 300);
    gl.glVertex2i(240, 300);
    gl.glVertex2i(240, 340);
    gl.glVertex2i(200, 340);
    gl.glEnd();
  }

  @Override
  public void dispose(GLAutoDrawable drawable) {
    // Cleanup code here
  }

  @Override
  public void init(GLAutoDrawable drawable) {
    System.out.println("init");
    GL2 gl = drawable.getGL().getGL2();
    gl.glClearColor(0, 0, 0, 1);
  }

  @Override
  public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
    gl.glOrtho(0, 640, 640, 0, 0, 1);
    gl.glMatrixMode(GL2.GL_MODELVIEW);
  }
}
