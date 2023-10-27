# MultiLoader Template

Based on [Jared's MultiLoader](https://github.com/jaredlll08/MultiLoader-Template) template and [Architectury](https://github.com/architectury/architectury-templates) templates.  
This project provides a Gradle project template that can compile mods for both Fabric and Forge using a common sourceset. This project uses Architectury [Loom](https://docs.architectury.dev/loom/introduction) and [Plugin](https://docs.architectury.dev/plugin/introduction).

## Getting Started

### IntelliJ IDEA
This guide will show how to import the MultiLoader Template into IntelliJ IDEA. The setup process is roughly equivalent to setting up Forge and Fabric independently and should be very familiar to anyone who has worked with their MDKs.

1. Clone or download this repository to your computer.
2. Configure the project by editing the `group`, `mod_name`, `mod_author`, and `mod_id` properties in the `gradle.properties` file. You will also need to change the `rootProject.name` property in `settings.gradle`, this should match the folder name of your project, or else IDEA may complain. Also rename `common/src/main/resources/examplemod.accesswidener` and modify `common/src/main/resources/architectury.common.json` to match your mod id.
3. Open the template's root folder as a new project in IDEA. This is the folder that contains this README file and the gradlew executable.
4. If your default JVM/JDK is not Java 17 you will encounter an error when opening the project. This error is fixed by going to `File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM`and changing the value to a valid Java 17 JVM. You will also need to set the Project SDK to Java 17. This can be done by going to `File > Project Structure > Project SDK`. Once both have been set open the Gradle tab in IDEA and click the refresh button to reload the project.
5. Open the Gradle tab in IDEA if it has not already been opened. Navigate to `Your Project > common > Tasks > loom > genSourcesWithVineflower`. Run this task to decompile Minecraft.
6. Open your Run/Debug Configurations. Under the Application category there should be options to run Forge and Fabric projects. Select one of the client options and try to run it.
7. Assuming you were able to run the game in step 6 your workspace should now be set up.

### Eclipse
Eclipse is not recommended nor supported for this project.