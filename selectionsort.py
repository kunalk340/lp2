def read(a,m):
    print("\nHow many numbers you want to sort ?: ")
    for i in range(m):
        b =float(input("Enter the numbers: "))
        a.append(b)
    print("\nThe numbers entered are: ")
    for i in range(m):
        print(a[i],end=" ")

def selection_sort(a,m):
    for i in range(m):
        minimum = i
        for j in range(i+1, m):
            if (a[j] < a[minimum]):         
              minimum = j     
        temp = a[i]
        a[i] = a[minimum]
        a[minimum] = temp
    return a 

                                       
def main():
        a = []
        m = int(input("Enter the number of students: "))
        read(a, m)
        print("\n\nThe sorted numbers using selection sort is: ")
        print(selection_sort(a, m))
           
main()
