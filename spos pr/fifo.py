from collections import deque

def fifo_page_replacement(pages, capacity):
    page_queue = deque(maxlen=capacity)
    page_faults = 0
    print("\n--- FIFO PAGE REPLACEMENT ---")

    for page in pages:
        if page not in page_queue:
            print(f"Page {page} loaded into memory.")
            page_queue.append(page)
            page_faults += 1
        else:
            print(f"Page {page} already in memory.")

    print(f"\nTotal Page Faults (Misses): {page_faults}")
    print(f"Final Pages in Memory: {list(page_queue)}")


# Main Program
if __name__ == "__main__":
    n = int(input("Enter number of pages: "))
    pages = [int(input(f"Enter page {i+1}: ")) for i in range(n)]
    capacity = int(input("Enter number of frames in memory: "))

    fifo_page_replacement(pages, capacity)
