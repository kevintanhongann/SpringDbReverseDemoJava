/**
 * This class is generated by jOOQ
 */
package com.example.sys.tables.records;


import com.example.sys.enums.ProcesslistTrxAutocommit;
import com.example.sys.enums.ProcesslistTrxState;
import com.example.sys.tables.Processlist;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcesslistRecord extends TableRecordImpl<ProcesslistRecord> {

	private static final long serialVersionUID = -37800066;

	/**
	 * Setter for <code>sys.processlist.thd_id</code>.
	 */
	public void setThdId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.processlist.thd_id</code>.
	 */
	public ULong getThdId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>sys.processlist.conn_id</code>.
	 */
	public void setConnId(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.processlist.conn_id</code>.
	 */
	public ULong getConnId() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>sys.processlist.user</code>.
	 */
	public void setUser(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.processlist.user</code>.
	 */
	public String getUser() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.processlist.db</code>.
	 */
	public void setDb(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.processlist.db</code>.
	 */
	public String getDb() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.processlist.command</code>.
	 */
	public void setCommand(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.processlist.command</code>.
	 */
	public String getCommand() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sys.processlist.state</code>.
	 */
	public void setState(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.processlist.state</code>.
	 */
	public String getState() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>sys.processlist.time</code>.
	 */
	public void setTime(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.processlist.time</code>.
	 */
	public Long getTime() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>sys.processlist.current_statement</code>.
	 */
	public void setCurrentStatement(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.processlist.current_statement</code>.
	 */
	public String getCurrentStatement() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>sys.processlist.statement_latency</code>.
	 */
	public void setStatementLatency(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.processlist.statement_latency</code>.
	 */
	public String getStatementLatency() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>sys.processlist.progress</code>.
	 */
	public void setProgress(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.processlist.progress</code>.
	 */
	public BigDecimal getProgress() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>sys.processlist.lock_latency</code>.
	 */
	public void setLockLatency(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.processlist.lock_latency</code>.
	 */
	public String getLockLatency() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>sys.processlist.rows_examined</code>.
	 */
	public void setRowsExamined(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.processlist.rows_examined</code>.
	 */
	public ULong getRowsExamined() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>sys.processlist.rows_sent</code>.
	 */
	public void setRowsSent(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.processlist.rows_sent</code>.
	 */
	public ULong getRowsSent() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>sys.processlist.rows_affected</code>.
	 */
	public void setRowsAffected(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>sys.processlist.rows_affected</code>.
	 */
	public ULong getRowsAffected() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>sys.processlist.tmp_tables</code>.
	 */
	public void setTmpTables(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>sys.processlist.tmp_tables</code>.
	 */
	public ULong getTmpTables() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>sys.processlist.tmp_disk_tables</code>.
	 */
	public void setTmpDiskTables(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>sys.processlist.tmp_disk_tables</code>.
	 */
	public ULong getTmpDiskTables() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>sys.processlist.full_scan</code>.
	 */
	public void setFullScan(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>sys.processlist.full_scan</code>.
	 */
	public String getFullScan() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>sys.processlist.last_statement</code>.
	 */
	public void setLastStatement(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>sys.processlist.last_statement</code>.
	 */
	public String getLastStatement() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>sys.processlist.last_statement_latency</code>.
	 */
	public void setLastStatementLatency(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>sys.processlist.last_statement_latency</code>.
	 */
	public String getLastStatementLatency() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>sys.processlist.current_memory</code>.
	 */
	public void setCurrentMemory(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>sys.processlist.current_memory</code>.
	 */
	public String getCurrentMemory() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>sys.processlist.last_wait</code>.
	 */
	public void setLastWait(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>sys.processlist.last_wait</code>.
	 */
	public String getLastWait() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>sys.processlist.last_wait_latency</code>.
	 */
	public void setLastWaitLatency(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>sys.processlist.last_wait_latency</code>.
	 */
	public String getLastWaitLatency() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>sys.processlist.source</code>.
	 */
	public void setSource(String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>sys.processlist.source</code>.
	 */
	public String getSource() {
		return (String) getValue(22);
	}

	/**
	 * Setter for <code>sys.processlist.trx_latency</code>.
	 */
	public void setTrxLatency(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>sys.processlist.trx_latency</code>.
	 */
	public String getTrxLatency() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>sys.processlist.trx_state</code>.
	 */
	public void setTrxState(ProcesslistTrxState value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>sys.processlist.trx_state</code>.
	 */
	public ProcesslistTrxState getTrxState() {
		return (ProcesslistTrxState) getValue(24);
	}

	/**
	 * Setter for <code>sys.processlist.trx_autocommit</code>.
	 */
	public void setTrxAutocommit(ProcesslistTrxAutocommit value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>sys.processlist.trx_autocommit</code>.
	 */
	public ProcesslistTrxAutocommit getTrxAutocommit() {
		return (ProcesslistTrxAutocommit) getValue(25);
	}

	/**
	 * Setter for <code>sys.processlist.pid</code>.
	 */
	public void setPid(String value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>sys.processlist.pid</code>.
	 */
	public String getPid() {
		return (String) getValue(26);
	}

	/**
	 * Setter for <code>sys.processlist.program_name</code>.
	 */
	public void setProgramName(String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>sys.processlist.program_name</code>.
	 */
	public String getProgramName() {
		return (String) getValue(27);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProcesslistRecord
	 */
	public ProcesslistRecord() {
		super(Processlist.PROCESSLIST);
	}

	/**
	 * Create a detached, initialised ProcesslistRecord
	 */
	public ProcesslistRecord(ULong thdId, ULong connId, String user, String db, String command, String state, Long time, String currentStatement, String statementLatency, BigDecimal progress, String lockLatency, ULong rowsExamined, ULong rowsSent, ULong rowsAffected, ULong tmpTables, ULong tmpDiskTables, String fullScan, String lastStatement, String lastStatementLatency, String currentMemory, String lastWait, String lastWaitLatency, String source, String trxLatency, ProcesslistTrxState trxState, ProcesslistTrxAutocommit trxAutocommit, String pid, String programName) {
		super(Processlist.PROCESSLIST);

		setValue(0, thdId);
		setValue(1, connId);
		setValue(2, user);
		setValue(3, db);
		setValue(4, command);
		setValue(5, state);
		setValue(6, time);
		setValue(7, currentStatement);
		setValue(8, statementLatency);
		setValue(9, progress);
		setValue(10, lockLatency);
		setValue(11, rowsExamined);
		setValue(12, rowsSent);
		setValue(13, rowsAffected);
		setValue(14, tmpTables);
		setValue(15, tmpDiskTables);
		setValue(16, fullScan);
		setValue(17, lastStatement);
		setValue(18, lastStatementLatency);
		setValue(19, currentMemory);
		setValue(20, lastWait);
		setValue(21, lastWaitLatency);
		setValue(22, source);
		setValue(23, trxLatency);
		setValue(24, trxState);
		setValue(25, trxAutocommit);
		setValue(26, pid);
		setValue(27, programName);
	}
}