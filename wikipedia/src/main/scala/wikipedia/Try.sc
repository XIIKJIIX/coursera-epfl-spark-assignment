val x = List(0,1,2,3,4,5,6)

x.par.aggregate(1) ((x, y) => x + y, (x, y) => x * y)