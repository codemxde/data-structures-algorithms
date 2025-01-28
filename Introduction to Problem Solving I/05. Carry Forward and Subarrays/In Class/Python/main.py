class Main:

    def __init__(self, str: str):
        self.str = str
    
    def count_a_g_pairs(self):
        count_a = 0
        a_g_pairs = 0

        arr = list(self.str)

        for i in range(0, len(arr)):
            if arr[i] == 'a':
                count_a += 1
            elif arr[i] == 'g':
                a_g_pairs += count_a
        
        print(f"total no of a-g pairs: {a_g_pairs}")

main =  Main(input("enter string to count a-g pairs: "))
main.count_a_g_pairs()