# Hare and Tortoise Algorithm (Floyd’s Cycle Detection)

### Repository: [TheAlgorithms - Java](https://github.com/TheAlgorithms/Java)

### Feature Request:
**[Issue #5693](https://github.com/TheAlgorithms/Java/issues/5693)**  
This feature request proposes adding the "Hare and Tortoise Algorithm" (Floyd’s Cycle Detection Algorithm) to the repository. This algorithm is widely used to detect cycles in sequences, particularly linked lists, and is a commonly featured algorithm in technical interviews.

---

## Algorithm Overview

The **Hare and Tortoise Algorithm**, also known as **Floyd’s Cycle Detection Algorithm**, is an efficient method for determining if a cycle exists in a sequence. The algorithm works by advancing two pointers through the sequence:
- The "hare" pointer moves two steps at a time.
- The "tortoise" pointer moves one step at a time.

If there is a cycle, the two pointers will eventually meet. The algorithm has:
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

This makes it an ideal solution for cycle detection problems in linked lists.

---

## Implementation Details

The implementation will include:
- A **standard use case** for detecting a cycle in a linked list.
- A **detailed explanation** of the algorithm’s time and space complexity.
- **Test cases** to validate the correctness and functionality of the algorithm.
- Code that follows Java best practices to ensure maintainability and clarity.

### Key Features:
- **Efficient Cycle Detection** in O(n) time and O(1) space.
- **Java Best Practices** are adhered to, ensuring a clean and understandable codebase.
- **Test Cases** are provided for various scenarios, including edge cases and boundary conditions.

---

## Contribution Details

### Branch Information:
- **Source Branch:** `feature/hare-and-tortoise`
- **Target Branch:** `main`

### Commit Messages:
Each commit will contain detailed messages to explain the progress made on the feature request, including code implementation, testing, and refactoring.

---

## Milestones and Issues

### **Milestone 1: Issue Selection**
- **Issue:** [ISSUE#4.1-BRIAN - Issue Selection](https://github.com/TheAlgorithms/Java/issues/5693)  
  - Description: Proposal to add the Hare and Tortoise Algorithm to the repository.
  - Tasks:
    - Propose the algorithm addition.
    - Outline its utility in cycle detection for linked lists.
    - Discuss time and space complexities.
  - Outcome: Project members will understand the relevance and importance of this feature for technical interviews and real-world applications.

### **Milestone 2: Algorithm Development**
- **Issue:** [ISSUE#4.2-BRIAN - Algorithm Development](https://github.com/TheAlgorithms/Java/issues/5693)  
  - Description: Developing the Hare and Tortoise Algorithm following best coding practices in Java.
  - Tasks:
    - Define the problem and clarify objectives.
    - Specify input/output formats and constraints.
    - Choose data structures and design paradigms.
    - Handle edge cases and optimize the algorithm.
  - Outcome: The algorithm is developed and structured following modular design, ready for testing.

### **Milestone 3: Algorithm Testing**
- **Issue:** [ISSUE#4.3-BRIAN - Algorithm Testing](https://github.com/TheAlgorithms/Java/issues/5693)  
  - Description: Testing the Hare and Tortoise Algorithm to ensure correctness and efficiency.
  - Tasks:
    - Create test cases for typical, boundary, and edge cases.
    - Performance testing under large inputs.
    - Stress testing to check algorithm stability.
  - Outcome: All tests pass successfully, ensuring that the algorithm is robust and performs as expected under all conditions.

### **Milestone 4: Pull Request Submission**
- **Issue:** [ISSUE#4.4-BRIAN - Pull Request](https://github.com/TheAlgorithms/Java/issues/5693)  
  - Description: Submitting the Hare and Tortoise Algorithm implementation via a pull request.
  - Tasks:
    - Summarize changes and link related issues.
    - Document the algorithm and add necessary comments.
    - Review the code for style and best practices compliance.
    - Run all tests and submit the pull request.
  - Outcome: The pull request is merged after peer review, and the feature becomes part of the repository.

---

## Testing and Validation

The implementation will undergo thorough testing to ensure accuracy, efficiency, and robustness. The tests will cover:
- **Typical Cases:** Standard linked list inputs with and without cycles.
- **Boundary Cases:** Linked lists with minimum input size, such as a single node.
- **Edge Cases:** Empty linked lists, large data sets, and null inputs.

### Test Environment:
- **Testing Framework:** JUnit will be used for automated testing.
- **Manual Testing:** Additional manual tests will ensure performance under various conditions.

---

## Pull Request Overview

A pull request will be created to submit the code changes. The pull request will include:
- A description of the algorithm.
- Files impacted by the changes.
- Links to the issue tracker (e.g., **TheAlgorithms#5693**).
- Test results showing successful execution of test cases.

---

## Team Information

- **Team:** Group 1B
- **Work Plan:** Our team follows a structured weekly plan, where each member is responsible for various parts of the algorithm development, testing, and documentation. Collaboration is managed via GitHub and regular code reviews.

---

## License Information

This contribution will follow the **MIT License** guidelines, allowing for free reuse in open-source and proprietary software, with minimal restrictions. For more details on the license, visit [Open Source Initiative - MIT License](https://opensource.org/licenses/MIT).
