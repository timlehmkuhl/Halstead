int ggt1(int x, int y)
{
  while (x != y) {
    if (x > y)
      x -= y;
    else
      y -= x;
  }
  return x;
}
