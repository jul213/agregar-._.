def f1(matriz):
    min_par = 0
    for i in range(min(len(matriz),len(matriz[0]))):
        if matriz[i][i] % 2 == 0:
            if min_par == 0 or matriz[i][i] < min_par:
                min_par = matriz[i][i]
    return min_par

matriz = [
    [1,2,3,4],
    [3,6,9,8],
    [1,9,7,5],
    [5,6,2,1]
]

print(f1(matriz))