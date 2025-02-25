package tech.intellispaces.ixora.samples.helloworld;

import tech.intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.ixora.cli.configuration.CliConfiguration;
import tech.intellispaces.jaquarius.annotation.Inject;
import tech.intellispaces.jaquarius.annotation.Module;
import tech.intellispaces.jaquarius.annotation.Startup;
import tech.intellispaces.jaquarius.system.Modules;

/**
 * This module demonstrates printing a string to the module console.
 * <p>
 * The module includes the configuration unit {@link CliConfiguration}. In this unit, a projection called "console"
 * is added to module. The "console" projection refers to the current CLI console of the module.
 */
@Module(CliConfiguration.class)
public abstract class HelloWorldSample2 {

  /**
   * The implementation of this method will be injected automatically.
   * <p>
   * In this case, this method will return the target of the module's "console" projection.
   */
  @Inject
  abstract MovableConsoleHandle console();

  /**
   * The module startup method.
   * This method will be invoked automatically after the module is started.
   * <p>
   * Inside the method, the "console" method is called to get the current console.
   */
  @Startup
  public void startup() {
    console().println("Hello, world!");
  }

  /**
   * The main method of the application loads and starts the module.
   */
  public static void main(String[] args) {
    Modules.load(HelloWorldSample2.class, args).start();
  }
}
