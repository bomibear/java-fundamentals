function not(a) {
  if (a === 0)
    return 1;
  else
    return 0;
}

function nand(a,b) {
  return not(and(a, b));
}

function nor(a,b) {
  return not(or(a,b))
}

function add1(a,b) {
  overflow = and(a,b)
  sum = xor(a,b)
  return {sum, overflow}
}

function zadd1(a,b,z) {
  var ones, zf
  zf = or(or(and(a,b), and(b,z)), and(a,z))

  j = or(a, nor(b,z))
  k = or(b, nor(a,z))
  l = or(z, nor(a,b))

  console.log("jkl", j, k, l)

  ones = xor(j, xor(k, l))
  return {ones, zf}
}