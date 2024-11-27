# Setting Up OpenJDK 1.8, 11, 17, and 21 with Homebrew and jenv on macOS (Zsh)

## Step 1: Install OpenJDK Versions Using Homebrew

1. **Install OpenJDK 1.8:**

   ```sh
   brew install --cask temurin8
   ```
2. **Install OpenJDK 11:**

   ```sh
   brew install --cask temurin11
   ```
3. **Install OpenJDK 17:**

   ```sh
   brew install --cask temurin17
   ```
4. **Install OpenJDK 21:**

   ```sh
   brew install --cask temurin21
   ```

Verify the installations by listing available Java versions:

```sh
/usr/libexec/java_home -V
```

---

## Step 2: Install and Configure `jenv`

1. **Install `jenv`:**

   ```sh
   brew install jenv
   ```

2. **Add `jenv` to your `zshrc`:**

   ```sh
   echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc
   echo 'eval "$(jenv init -)"' >> ~/.zshrc
   ```

3. **Enable the `export` plugin to update `JAVA_HOME` automatically:**

   ```sh
   jenv enable-plugin export
   ```

4. **Reload the shell configuration:**

   ```sh
   source ~/.zshrc
   ```

---

## Step 3: Add Java Versions to `jenv`

1. Use `jenv` to add each installed Java version. Replace `<path>` with the paths from `/usr/libexec/java_home -V`. Example paths are provided below:

   ```sh
   jenv add /Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home
   jenv add /Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home
   jenv add /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home
   jenv add /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home
   ```

2. Verify the added versions:

   ```sh
   jenv versions
   ```

---

## Step 4: Set Global, Local, or Shell Java Versions

- **Set a Global Java Version:**

  ```sh
  jenv global 17
  ```

  This sets the default Java version system-wide.

- **Set a Local Java Version:**

  ```sh
  cd /path/to/project
  jenv local 11
  ```

  This creates a `.java-version` file in the current directory.

- **Set a Shell-Specific Java Version:**

  ```sh
  jenv shell 8
  ```

  This temporarily changes the Java version for the current shell session.

- **Verify the Current Java Version:**

  ```sh
  java --version
  echo $JAVA_HOME
  ```

---

## Step 5: Testing and Switching Versions

1. **Test Switching Global Versions:**

   ```sh
   jenv global 21
   java --version
   echo $JAVA_HOME
   ```

2. **Test Local Versions for a Project:**

   ```sh
   cd /path/to/project
   jenv local 11
   java --version
   echo $JAVA_HOME
   ```

3. **Test Shell-Specific Versions:**

   ```sh
   jenv shell 1.8
   java --version
   echo $JAVA_HOME
   ```

---

## Troubleshooting

1. **Java Version Not Changing:**

    - Ensure `jenv` is initialized in your shell:

      ```sh
      export PATH="$HOME/.jenv/bin:$PATH"
      eval "$(jenv init -)"
      ```

2. **Check Java Binary:**

    - Ensure the `java` binary points to `jenv` shims:

      ```sh
      which java
      ```

      If not, adjust your `PATH`:

      ```sh
      export PATH="$HOME/.jenv/shims:$PATH"
      ```

3. **Add Missing Java Versions:**

    - If you missed a Java version:

      ```sh
      /usr/libexec/java_home -V
      jenv add /path/to/java/version
      ```

---

## Final Notes

System is set up with OpenJDK 1.8, 11, 17, and 21 managed by `jenv`. You can switch between versions easily with `jenv global`, `jenv local`, or `jenv shell` commands.
