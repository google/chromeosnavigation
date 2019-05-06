/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.emilieroberts.chromeosnavigationdemo

import android.content.Context
import androidx.appcompat.app.AlertDialog

//Show a simple about dialog
fun showAboutDialog(context: Context) {
    val builder = AlertDialog.Builder(context, android.R.style.Theme_Material_Dialog_Alert)
    builder.setTitle(R.string.dialog_about_title)
        .setMessage(R.string.dialog_about_message)
        .setPositiveButton(R.string.dialog_about_ok) { dialog, _ ->
            dialog.dismiss()
        }
        .show()
}