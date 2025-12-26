package com.beanScopes;

public class Circle3 implements ShapeInterface {

	   Draw2D draw2d ;

	   Draw3D draw3d ;

	   public Circle3 (Draw2D draw2d ,Draw3D draw3d )
	   {

               this.draw2d = draw2d ;
			   this.draw3d = draw3d ;
	   }

       @Override
       public void draw()
	   {
                draw2d.draw2d("circle3"); 

	   }


}
