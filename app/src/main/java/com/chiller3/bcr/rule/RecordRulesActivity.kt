/*
 * SPDX-FileCopyrightText: 2023-2024 Andrew Gunnerson
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.chiller3.bcr.rule

import androidx.fragment.app.Fragment
import com.chiller3.bcr.PreferenceBaseActivity
import com.chiller3.bcr.R

class RecordRulesActivity : PreferenceBaseActivity() {
    override val titleResId: Int = R.string.pref_record_rules_name

    override val showUpButton: Boolean = true

    override fun createFragment(): Fragment = RecordRulesFragment()
}
