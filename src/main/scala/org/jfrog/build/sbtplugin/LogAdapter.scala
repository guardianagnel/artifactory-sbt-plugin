/*
 * Copyright (C) 2014 JFrog Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jfrog.build.sbtplugin

import org.jfrog.build.api.util.{Log=> JLog}

class LogAdapter(log: sbt.Logger) extends JLog {
	override def debug(message: String): Unit = log.debug(message)
	override def info(message: String): Unit = log.info(message)
	override def warn(message: String): Unit = log.warn(message)
	override def error(message: String): Unit = log.error(message)
	override def error(message: String, t: Throwable): Unit = {
		log.error(message)
		log.trace(t)
	}
}