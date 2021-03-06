/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */
package com.openosrs.injector

import org.gradle.api.Project

open class Injextention(project: Project) {
    val vanilla = project.objects.fileProperty()
    val rsclient = project.objects.fileProperty()
    val mixins = project.objects.fileProperty()
    val rsapi = project.objects.fileProperty()
    val output = project.objects.fileProperty()
}

