<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.txtPhone = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtLastName = New System.Windows.Forms.TextBox()
        Me.txtFirstName = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.chkExpressInstall = New System.Windows.Forms.CheckBox()
        Me.txtDepositAmount = New System.Windows.Forms.TextBox()
        Me.txtPanelAmount = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.gbCharges = New System.Windows.Forms.GroupBox()
        Me.lblTotalCost = New System.Windows.Forms.Label()
        Me.lblAdditionalPanelCharge = New System.Windows.Forms.Label()
        Me.lblBaseCharge = New System.Windows.Forms.Label()
        Me.lblDepositAmount = New System.Windows.Forms.Label()
        Me.lblBalanceDue = New System.Windows.Forms.Label()
        Me.btnClose = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.lblBalance = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.ErrorProvider1 = New System.Windows.Forms.ErrorProvider(Me.components)
        Me.ToolTip1 = New System.Windows.Forms.ToolTip(Me.components)
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.gbCharges.SuspendLayout()
        CType(Me.ErrorProvider1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.BackColor = System.Drawing.SystemColors.Control
        Me.GroupBox1.Controls.Add(Me.txtPhone)
        Me.GroupBox1.Controls.Add(Me.Label3)
        Me.GroupBox1.Controls.Add(Me.txtLastName)
        Me.GroupBox1.Controls.Add(Me.txtFirstName)
        Me.GroupBox1.Controls.Add(Me.Label2)
        Me.GroupBox1.Controls.Add(Me.Label1)
        Me.GroupBox1.Location = New System.Drawing.Point(12, 12)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(510, 130)
        Me.GroupBox1.TabIndex = 0
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Customer Information"
        '
        'txtPhone
        '
        Me.txtPhone.Location = New System.Drawing.Point(327, 69)
        Me.txtPhone.Name = "txtPhone"
        Me.txtPhone.Size = New System.Drawing.Size(125, 20)
        Me.txtPhone.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(324, 47)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(41, 13)
        Me.Label3.TabIndex = 4
        Me.Label3.Text = "Phone:"
        '
        'txtLastName
        '
        Me.txtLastName.Location = New System.Drawing.Point(84, 70)
        Me.txtLastName.Name = "txtLastName"
        Me.txtLastName.Size = New System.Drawing.Size(175, 20)
        Me.txtLastName.TabIndex = 1
        '
        'txtFirstName
        '
        Me.txtFirstName.Location = New System.Drawing.Point(84, 40)
        Me.txtFirstName.Name = "txtFirstName"
        Me.txtFirstName.Size = New System.Drawing.Size(175, 20)
        Me.txtFirstName.TabIndex = 0
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(18, 72)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(61, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Last Name:"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(18, 41)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(60, 13)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "First Name:"
        '
        'GroupBox2
        '
        Me.GroupBox2.BackColor = System.Drawing.SystemColors.Control
        Me.GroupBox2.Controls.Add(Me.chkExpressInstall)
        Me.GroupBox2.Controls.Add(Me.txtDepositAmount)
        Me.GroupBox2.Controls.Add(Me.txtPanelAmount)
        Me.GroupBox2.Controls.Add(Me.Label5)
        Me.GroupBox2.Controls.Add(Me.Label4)
        Me.GroupBox2.Location = New System.Drawing.Point(12, 160)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(320, 128)
        Me.GroupBox2.TabIndex = 1
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Installation Options"
        '
        'chkExpressInstall
        '
        Me.chkExpressInstall.AutoSize = True
        Me.chkExpressInstall.Location = New System.Drawing.Point(49, 105)
        Me.chkExpressInstall.Name = "chkExpressInstall"
        Me.chkExpressInstall.Size = New System.Drawing.Size(138, 17)
        Me.chkExpressInstall.TabIndex = 4
        Me.chkExpressInstall.Text = "Express installation (5%)"
        Me.chkExpressInstall.UseVisualStyleBackColor = True
        '
        'txtDepositAmount
        '
        Me.txtDepositAmount.Location = New System.Drawing.Point(104, 69)
        Me.txtDepositAmount.Name = "txtDepositAmount"
        Me.txtDepositAmount.Size = New System.Drawing.Size(100, 20)
        Me.txtDepositAmount.TabIndex = 1
        '
        'txtPanelAmount
        '
        Me.txtPanelAmount.Location = New System.Drawing.Point(104, 35)
        Me.txtPanelAmount.Name = "txtPanelAmount"
        Me.txtPanelAmount.Size = New System.Drawing.Size(100, 20)
        Me.txtPanelAmount.TabIndex = 0
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(8, 72)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(84, 13)
        Me.Label5.TabIndex = 1
        Me.Label5.Text = "Deposit amount:"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(8, 38)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(93, 13)
        Me.Label4.TabIndex = 0
        Me.Label4.Text = "Number of panels:"
        '
        'gbCharges
        '
        Me.gbCharges.BackColor = System.Drawing.SystemColors.Control
        Me.gbCharges.Controls.Add(Me.lblTotalCost)
        Me.gbCharges.Controls.Add(Me.lblAdditionalPanelCharge)
        Me.gbCharges.Controls.Add(Me.lblBaseCharge)
        Me.gbCharges.Controls.Add(Me.lblDepositAmount)
        Me.gbCharges.Controls.Add(Me.lblBalanceDue)
        Me.gbCharges.Controls.Add(Me.btnClose)
        Me.gbCharges.Controls.Add(Me.btnClear)
        Me.gbCharges.Controls.Add(Me.lblBalance)
        Me.gbCharges.Controls.Add(Me.Label9)
        Me.gbCharges.Controls.Add(Me.Label8)
        Me.gbCharges.Controls.Add(Me.Label7)
        Me.gbCharges.Controls.Add(Me.Label6)
        Me.gbCharges.Location = New System.Drawing.Point(12, 303)
        Me.gbCharges.Name = "gbCharges"
        Me.gbCharges.Size = New System.Drawing.Size(510, 246)
        Me.gbCharges.TabIndex = 2
        Me.gbCharges.TabStop = False
        Me.gbCharges.Text = "Charges"
        Me.gbCharges.Visible = False
        '
        'lblTotalCost
        '
        Me.lblTotalCost.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblTotalCost.Location = New System.Drawing.Point(159, 123)
        Me.lblTotalCost.Name = "lblTotalCost"
        Me.lblTotalCost.Size = New System.Drawing.Size(125, 23)
        Me.lblTotalCost.TabIndex = 16
        Me.lblTotalCost.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'lblAdditionalPanelCharge
        '
        Me.lblAdditionalPanelCharge.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblAdditionalPanelCharge.Location = New System.Drawing.Point(159, 80)
        Me.lblAdditionalPanelCharge.Name = "lblAdditionalPanelCharge"
        Me.lblAdditionalPanelCharge.Size = New System.Drawing.Size(125, 23)
        Me.lblAdditionalPanelCharge.TabIndex = 15
        Me.lblAdditionalPanelCharge.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'lblBaseCharge
        '
        Me.lblBaseCharge.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblBaseCharge.Location = New System.Drawing.Point(159, 40)
        Me.lblBaseCharge.Name = "lblBaseCharge"
        Me.lblBaseCharge.Size = New System.Drawing.Size(125, 23)
        Me.lblBaseCharge.TabIndex = 14
        Me.lblBaseCharge.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'lblDepositAmount
        '
        Me.lblDepositAmount.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblDepositAmount.Location = New System.Drawing.Point(159, 164)
        Me.lblDepositAmount.Name = "lblDepositAmount"
        Me.lblDepositAmount.Size = New System.Drawing.Size(125, 23)
        Me.lblDepositAmount.TabIndex = 13
        Me.lblDepositAmount.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'lblBalanceDue
        '
        Me.lblBalanceDue.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblBalanceDue.Location = New System.Drawing.Point(159, 204)
        Me.lblBalanceDue.Name = "lblBalanceDue"
        Me.lblBalanceDue.Size = New System.Drawing.Size(125, 23)
        Me.lblBalanceDue.TabIndex = 12
        Me.lblBalanceDue.TextAlign = System.Drawing.ContentAlignment.MiddleLeft
        '
        'btnClose
        '
        Me.btnClose.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClose.Location = New System.Drawing.Point(308, 149)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(175, 70)
        Me.btnClose.TabIndex = 11
        Me.btnClose.Text = "Close"
        Me.ToolTip1.SetToolTip(Me.btnClose, "Close form")
        Me.btnClose.UseVisualStyleBackColor = True
        '
        'btnClear
        '
        Me.btnClear.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.Location = New System.Drawing.Point(308, 56)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(175, 70)
        Me.btnClear.TabIndex = 10
        Me.btnClear.Text = "Clear"
        Me.ToolTip1.SetToolTip(Me.btnClear, "Clear all fields")
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'lblBalance
        '
        Me.lblBalance.AutoSize = True
        Me.lblBalance.Location = New System.Drawing.Point(66, 209)
        Me.lblBalance.Name = "lblBalance"
        Me.lblBalance.Size = New System.Drawing.Size(70, 13)
        Me.lblBalance.TabIndex = 4
        Me.lblBalance.Text = "Balance due:"
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(52, 169)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(84, 13)
        Me.Label9.TabIndex = 3
        Me.Label9.Text = "Deposit amount:"
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(79, 128)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(57, 13)
        Me.Label8.TabIndex = 2
        Me.Label8.Text = "Total cost:"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(46, 85)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(90, 13)
        Me.Label7.TabIndex = 1
        Me.Label7.Text = "Additional panels:"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(6, 45)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(128, 13)
        Me.Label6.TabIndex = 0
        Me.Label6.Text = "Base charge for 2 panels:"
        '
        'btnCalculate
        '
        Me.btnCalculate.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalculate.Location = New System.Drawing.Point(347, 191)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(175, 70)
        Me.btnCalculate.TabIndex = 2
        Me.btnCalculate.Text = "&Calculate Charges"
        Me.ToolTip1.SetToolTip(Me.btnCalculate, "Calculate charges for solar panel installation")
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'ErrorProvider1
        '
        Me.ErrorProvider1.ContainerControl = Me
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ControlDarkDark
        Me.ClientSize = New System.Drawing.Size(534, 561)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.gbCharges)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "Form1"
        Me.Text = "Megawatt Solar Panels, Inc."
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.gbCharges.ResumeLayout(False)
        Me.gbCharges.PerformLayout()
        CType(Me.ErrorProvider1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents txtPhone As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents txtLastName As TextBox
    Friend WithEvents txtFirstName As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents chkExpressInstall As CheckBox
    Friend WithEvents txtDepositAmount As TextBox
    Friend WithEvents txtPanelAmount As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents gbCharges As GroupBox
    Friend WithEvents btnClose As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents lblBalance As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents btnCalculate As Button
    Friend WithEvents lblTotalCost As Label
    Friend WithEvents lblAdditionalPanelCharge As Label
    Friend WithEvents lblBaseCharge As Label
    Friend WithEvents lblDepositAmount As Label
    Friend WithEvents lblBalanceDue As Label
    Friend WithEvents ToolTip1 As ToolTip
    Friend WithEvents ErrorProvider1 As ErrorProvider
End Class
