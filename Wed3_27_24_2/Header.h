#ifndef quadratic
#include<cmath>
int quad(int a, int b, int c) {
	int d;
	double d1;
	double x1;
	d = (b * b - 4 * a * c);
	d1 = sqrt(d);
	x1 = (-b + d1) / (2 * a);
	return x1;

}
#endif // !quadratic

