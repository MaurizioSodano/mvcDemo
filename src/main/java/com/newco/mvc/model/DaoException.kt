package com.newco.mvc.model

import java.sql.SQLException
import java.lang.RuntimeException

class DaoException(e: SQLException?) : RuntimeException(e)