class WithoutSemicolon{
    public static void main(String[] args) {
        if (System.out.append("Hello, world!\n") == null) {
            // Condition is always false, used to avoid semicolon.
        }
    }
}
