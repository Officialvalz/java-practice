const LuchiStack = require("./LuchiStack");

test("Stack is empthy initially", () => {
    const stack = new LuchiStack(3);
    expect(stack.isEmpty()).toBe(true);
});

test("Stack is not empthy", () => {
    const stack = new LuchiStack(3);
    expect(stack.isEmpty().toBe(false);
});
