package com.inversionofcontrol;

public class Square2  implements ShapeInterface {

	 Draw2D draw2d ;

	 Draw3D draw3d ;

	 public Draw2D getDraw2d() {
		 return draw2d;
	 }

	 public void setDraw2d(Draw2D draw2d) {
		 this.draw2d = draw2d;
	 }

	 public Draw3D getDraw3d() {
		 return draw3d;
	 }

	 public void setDraw3d(Draw3D draw3d) {
		 this.draw3d = draw3d;
	 }

	 @Override
    public void draw()
	{
          draw2d.draw2d("square2")  ; 

	}
	 

}
