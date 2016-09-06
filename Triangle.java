class Triangle {
  public Integer mSideA;
  public Integer mSideB;
  public Integer mSideC;

  public Triangle(Integer a, Integer b, Integer c) {
    mSideA = a;
    mSideB = b;
    mSideC = c;
  }

  public int triangleTypeChecker() {
    if (mSideA + mSideB < mSideC || mSideB + mSideC < mSideA || mSideA + mSideC < mSideB){
      return 1;
    } else if(mSideA == mSideB && mSideB == mSideC && mSideA == mSideC){
      return 2;
    } else if(mSideA == mSideB || mSideB == mSideC || mSideA == mSideC){
      return 3;
    } else {
      return 4;
    }
  }
}
