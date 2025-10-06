# Kotlin idioms for dealing with null-safety

## These are ** Kotlin’s null-safety idioms **:

 - `?.` safe call

 - `?:` Elvis

 - `let` for scoped actions

 - `takeIf` for conditional filtering

 - `toIntOrNull` for safe parsing

 - `as?` for safe casting

 - `getOrNull` for safe list indexing

------------------------------------------------------------------------
    
### 1. Safe call + Elvis

``` kotlin
val nChars = text?.length ?: 0
```

-   `text?.length` → uses the **safe call operator** (`?.`). If `text`
    is non-null, it returns its length. If `text` is null, it returns
    `null`.
-   `?: 0` → the **Elvis operator**: if the left side is null, it falls
    back to `0`.
-   ✅ Result: `nChars` is always an `Int`, either the string length or
    `0`.

------------------------------------------------------------------------

### 2. Scope function if not null

``` kotlin
maybe?.let { use(it) }
```

-   `maybe?.let { ... }` → executes the block **only if `maybe` is
    non-null**.
-   Inside the block, `it` refers to `maybe`.
-   ✅ Effect: `use(maybe)` is called only when `maybe` is not null.
    Nothing happens if it's null.

------------------------------------------------------------------------

### 3. Conditional filtering

``` kotlin
val cleaned = input?.trim()?.takeIf { it.isNotEmpty() } ?: "(vide)"
```

-   `input?.trim()` → trims only if `input` is non-null, otherwise
    returns null.
-   `.takeIf { it.isNotEmpty() }` → returns the string only if it
    satisfies the condition (`isNotEmpty()`), else returns null.
-   `?: "(vide)"` → if null, falls back to the default string
    `"(vide)"`.
-   ✅ Result: `cleaned` is either a trimmed non-empty string, or
    `"(vide)"`.

------------------------------------------------------------------------

### 4. Safe conversions

``` kotlin
val n = "12".toIntOrNull() ?: 0
val nonNeg = n.coerceAtLeast(0)
```

-   `"12".toIntOrNull()` → tries to convert the string to an integer.
    Returns `null` if it fails (instead of throwing).
-   `?: 0` → fallback to `0` if parsing fails.
-   `.coerceAtLeast(0)` → ensures the value is **at least 0** (negative
    numbers become 0).
-   ✅ Result: a safe, non-negative integer.

------------------------------------------------------------------------

### 5. Safe cast

``` kotlin
val m = (any as? String)?.length ?: 0
```

-   `any as? String` → tries to cast `any` to `String`. If not possible,
    returns `null` (instead of throwing).
-   `?.length` → if cast succeeded, get the string's length, otherwise
    `null`.
-   `?: 0` → fallback if null.
-   ✅ Result: `m` is always an `Int`, 0 if `any` isn't a `String`.

------------------------------------------------------------------------

### 6. List safe access

``` kotlin
val x = xs.getOrNull(i) ?: default
```

-   `xs.getOrNull(i)` → safely get element at index `i`. Returns `null`
    if `i` is out of bounds.
-   `?: default` → fallback to `default` if null.
-   ✅ Result: avoids `IndexOutOfBoundsException`.

------------------------------------------------------------------------

