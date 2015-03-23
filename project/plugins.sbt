// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "sbt-vaadin-plugin repo" at "http://henrikerola.github.io/repository/snapshots"

addSbtPlugin("org.vaadin.sbt" % "sbt-vaadin-plugin" % "1.1.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")
