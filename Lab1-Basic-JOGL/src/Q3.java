import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Q3 extends Window {
  public Q3() {
    super("Quiz 3");
  }

  @Override
  public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();
    gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
    gl.glLineWidth(4);

    gl.glColor3f(1, 0, 0); // Red color
    gl.glBegin(GL2.GL_POLYGON);
    gl.glVertex2i(170, 270);
    gl.glVertex2i(240, 170);
    gl.glVertex2i(310, 270);
    gl.glEnd();

    gl.glColor3f(0, 1, 0); // Green color
    gl.glBegin(GL2.GL_POLYGON);
    gl.glVertex2i(170, 270);
    gl.glVertex2i(310, 270);
    gl.glVertex2i(310, 370);
    gl.glVertex2i(170, 370);
    gl.glVertex2i(170, 270);
    gl.glEnd();

    gl.glColor3f(0, 0, 1f); // Blue color
    gl.glBegin(GL2.GL_POLYGON);
    gl.glVertex2i(240, 170);
    gl.glVertex2i(440, 167);
    gl.glVertex2i(500, 260);
    gl.glVertex2i(310, 270);
    gl.glEnd();

    gl.glColor3f(0.5f, 0.5f, 1f); // Lihgt Purple color
    gl.glBegin(GL2.GL_POLYGON);
    gl.glVertex2i(310, 270);
    gl.glVertex2i(500, 260);
    gl.glVertex2i(500, 360);
    gl.glVertex2i(310, 370);
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
    gl.glClearColor(1, 1, 1, 1);
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
