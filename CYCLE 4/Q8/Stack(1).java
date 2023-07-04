class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if self.is_empty():
            return "Stack is empty"
        else:
            return self.items.pop()

    def peek(self):
        if self.is_empty():
            return "Stack is empty"
        else:
            return self.items[-1]

    def size(self):
        return len(self.items)


# Example usage:
stack = Stack()

while True:
    print("\n1. Push an item")
    print("2. Pop an item")
    print("3. Exit")
    choice = int(input("Enter your choice (1-3): "))

    if choice == 1:
        item = input("Enter the item to push: ")
        stack.push(item)
        print("Item pushed onto the stack.")
    elif choice == 2:
        popped_item = stack.pop()
        print("Popped item:", popped_item)
    elif choice == 3:
        break
    else:
        print("Invalid choice. Please try again.")

    print("Stack size:", stack.size())
    if not stack.is_empty():
        print("Top element:", stack.peek())
    else:
        print("Stack is empty.")

print("Exiting the program.")

