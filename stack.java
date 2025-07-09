class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        """Add an item to the top of the stack."""
        self.items.append(item)
        print(f"Pushed: {item}")

    def pop(self):
        """Remove and return the top item."""
        if self.is_empty():
            print("Stack is empty. Cannot pop.")
            return None
        return self.items.pop()

    def peek(self):
        """Return the top item without removing it."""
        if self.is_empty():
            print("Stack is empty.")
            return None
        return self.items[-1]

    def is_empty(self):
        """Check if the stack is empty."""
        return len(self.items) == 0

    def size(self):
        """Return the number of items in the stack."""
        return len(self.items)

    def display(self):
        """Display the stack from top to bottom."""
        if self.is_empty():
            print("Stack is empty.")
        else:
            print("Stack (top to bottom):")
            for item in reversed(self.items):
                print(item)

    def clear(self):
        """Remove all items from the stack."""
        self.items.clear()
        print("Stack cleared.")


# Example Usage
if __name__ == "__main__":
    s = Stack()
    s.push(10)
    s.push(20)
    s.push(30)
    s.display()
    print("Top element:", s.peek())
    print("Popped element:", s.pop())
    s.display()
    print("Stack size:", s.size())
    s.clear()
    s.display()
