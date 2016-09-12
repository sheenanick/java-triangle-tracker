class Triangle {
  public Integer mSideA;
  public Integer mSideB;
  public Integer mSideC;

  public Triangle(Integer a, Integer b, Integer c) {
    mSideA = a;
    mSideB = b;
    mSideC = c;
  }

  public String triangleTypeChecker() {
    if (mSideA + mSideB < mSideC || mSideB + mSideC < mSideA || mSideA + mSideC < mSideB){
      String triangle1 = "This is not a triangle";
      return triangle1;
    } else if(mSideA == mSideB && mSideB == mSideC && mSideA == mSideC){
      String triangle2 = "This is an equilateral triangle";
      return triangle2;
    } else if(mSideA == mSideB || mSideB == mSideC || mSideA == mSideC){
      String triangle3 = "This is an isosceles triangle";
      return triangle3;
    } else {
      String triangle4 = "This is a scalene triangle";
      return triangle4;
    }
  }
}
