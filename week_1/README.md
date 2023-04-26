## Answers for questions in some exercises

### 6.1

> What happens if users choose “Cancel”?

The `JOptionPane.YES_OPTION` would be set to `false`, making the next dialogue display "No".

> How to customize the options to users, e.g. only two options: “Yes” and “No”, OR “I do”
> and “I don’t” (Suggestion: Use Javadocs or using Eclipse/Netbean IDE help)

You can make a custom options by predefining the messages, and use them with `JOptionPane.showOptionDialog`

```java
Object[] options = { "I do", "I don't" };
JOptionPane.showOptionDialog(
  null,
  "Would you like to agree to our terms of service", // Message
  "Agreement to TOS", // Title
  JOptionPane.YES_NO_OPTION,
  JOptionPane.QUESTION_MESSAGE,
  null, // Icons
  options, // Custom option
  options[0] // Default option
);
```
