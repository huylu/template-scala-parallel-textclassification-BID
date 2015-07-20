
name := "org.template.textclassification"

organization := "io.prediction"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "io.prediction"    % "core_2.11"        % pioVersion.value % "provided",
  "org.apache.spark" %% "spark-core" % "1.4.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.4.0" % "provided",
  "org.xerial.snappy" % "snappy-java" % "1.1.1.7"
)

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case y if y.startsWith("doc")     => MergeStrategy.discard
    case x => old(x)
  }
}
