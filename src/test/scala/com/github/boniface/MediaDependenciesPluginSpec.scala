package com.github.boniface

import org.scalatest.funsuite.AnyFunSuite
import sbt._

class MediaDependenciesPluginSpec extends AnyFunSuite {

  test("MediaDependenciesPlugin should include expected dependencies") {
    val settings = MediaDependenciesPlugin.projectSettings
    val libraryDependenciesSetting = settings.collect {
      case setting: Setting[_] if setting.key.key.label == "libraryDependencies" =>
        setting.init match {
          case seq: Seq[_] => seq.collect { case module: ModuleID => module }
          case _ => Seq.empty
        }
    }.flatten

  }
}